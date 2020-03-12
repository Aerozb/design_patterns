package Adapter.springmvc;

public interface HandlerAdapter {
    boolean supports(Object handler);

    void handle(Object handler);
}

class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return handler instanceof SimpleController;
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }
}

class HttpHandlerAdapter implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

}

class AnnotationHandlerAdapter implements HandlerAdapter {
    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }

    @Override
    public boolean supports(Object handler) {

        return (handler instanceof AnnotationController);
    }

}
