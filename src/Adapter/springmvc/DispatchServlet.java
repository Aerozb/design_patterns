package Adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch() {
        SimpleController sc=new SimpleController();
        HandlerAdapter handler = getHandler(sc);
        handler.handle(sc);

    }
    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.supports(controller)){
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
