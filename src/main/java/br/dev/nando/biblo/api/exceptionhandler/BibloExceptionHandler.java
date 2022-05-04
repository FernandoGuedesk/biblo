package br.dev.nando.biblo.api.exceptionhandler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BibloExceptionHandler extends ResponseEntityExceptionHandler{
	
	@Autowired
	private MessageSource messageSource;
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		
		List<MensagemErro> erros = criarListaDeErros(ex.getBindingResult());
		
		
		return handleExceptionInternal(ex, erros, headers, HttpStatus.BAD_REQUEST, request);
	}

	private List<MensagemErro> criarListaDeErros(BindingResult bindingResult) {
		
		List<MensagemErro> erros = new ArrayList<>();
	
		for (FieldError fieldErro : bindingResult.getFieldErrors() ) {
			
			String mensagemUsuario = messageSource.getMessage(fieldErro, LocaleContextHolder.getLocale());
			String mensagemDesenvolvedor = fieldErro.toString();
			
			erros.add(new MensagemErro(mensagemUsuario, mensagemDesenvolvedor));
			
		}
		
		return erros;
	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return handleExceptionInternal(ex, "Campo inexistente", headers, HttpStatus.BAD_REQUEST, request);
	}
	

}
