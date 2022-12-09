package trainingjava;


abstract class Window{
	    public abstract void print();
	    public abstract void show();
}



class PMWindow extends Window{



	   @Override
	    public void print() {
	        System.out.println("This is from PMWindow in print");
	        
	    }



	   @Override
	    public void show() {
	        System.out.println("This is from PMWindow in show");
	        
	    }
	    
	}



class MotifWindow extends Window{



	   @Override
	    public void print() {
	        System.out.println("This is from  MotifWindow in print");
	        
	    }



	   @Override
	    public void show() {
	        System.out.println("This is from MotifWindow in show");
	        
	    }
}



abstract class ScrollBar{
	    public abstract void scrollTop();
	    public abstract void scrollBottom();
}



class PMScrollBar extends ScrollBar{



	   @Override
	    public void scrollTop() {
	        System.out.println("Scroll top PMScrollBar");
	        
	    }



	   @Override
	    public void scrollBottom() {
	        System.out.println("Scroll bottom PMScrollBar");
	        
	    }
}


class MotifScrollBar extends ScrollBar{



	   @Override
	    public void scrollTop() {
	        System.out.println("Scroll top MotifScrollBar");
	        
	    }



	   @Override
	    public void scrollBottom() {
	        System.out.println("Scroll bottom MotifScrollBar");
	        
	    }
}



abstract class WidgetFactory{
	    abstract Window createWindow();
	    abstract ScrollBar createScrollBar();
}



class PMWidgetFactory extends WidgetFactory{
	    Window createWindow()
	    {
	        return new PMWindow();
	    }
	    ScrollBar createScrollBar()
	    {
	        return new PMScrollBar();
	    }
}



class MotifWidgetFactory extends WidgetFactory{
	    Window createWindow()
	    {
	        return new MotifWindow();
	    }
	    ScrollBar createScrollBar()
	    {
	        return new MotifScrollBar();
	    }
}



class FactoryMaker
	{
	    private static WidgetFactory pf=null;
	    static WidgetFactory getFactory(String choice)
	    {
	        if(choice.equals("PM"))
	        {
	            pf=new PMWidgetFactory();
	        }
	        else if(choice.equals("Motif"))
	        {
	            pf=new MotifWidgetFactory();
	        }
	        return pf;
	    }
}



public class Assesment{
	
	public static void main(String args[]){
		
	        WidgetFactory wf = FactoryMaker.getFactory("Motif");
	        Window window = wf.createWindow();
	        window.show();
	    }
}

