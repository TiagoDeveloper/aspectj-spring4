package br.com.tiagodeveloper.aspects;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.lang.reflect.Method;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import br.com.tiagodeveloper.controllers.AspectController;
import br.com.tiagodeveloper.models.Contato;


@Aspect
@Component
public class AspectOfController {
	
	@Before("execution(* br.com.tiagodeveloper.controllers.AspectController.home(..))")
	public void antes(){
		System.out.println("Caiu aqui antes da requisição!");
	}
	@After("execution(* br.com.tiagodeveloper.controllers.AspectController.home(..))")
	public void depois(){
		System.out.println("Caiu aqui depois da requisição!");
	}
	@SuppressWarnings("unchecked")
	@Around("execution(* br.com.tiagodeveloper.controllers.AspectController.contatos(..))")
	public List<Contato> contatos(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("Caiu aqui depois da requisição!");
			
		List<Contato>  obj = (List<Contato>) joinPoint.proceed();
		obj.forEach(c -> 
			c.add(
				linkTo(
				methodOn(AspectController.class)
				.contatos())
				.slash(c.getIdContato())
				.withSelfRel()
		));;	
//		for(Object o : obj){
//			for(Method m : o.getClass().getMethods()){
//				if(m.getName().startsWith("get")){
//					if(m.getName().equals("getClass"))
//						System.out.println("====>"+m.getName());
//					
//					System.out.println(m.invoke(o, null));
//				}
//			}
//		}
		return obj;
	}
	
}
