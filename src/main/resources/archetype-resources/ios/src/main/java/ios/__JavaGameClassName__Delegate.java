#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ios;

import ${package}.core.${JavaGameClassName};

import org.robovm.cocoatouch.foundation.NSAutoreleasePool;
import org.robovm.cocoatouch.uikit.UIApplication;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;

public class ${JavaGameClassName}Delegate extends IOSApplication.Delegate {
    class InnerClass {
    }

    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        return new IOSApplication(new ${JavaGameClassName}(), config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, ${JavaGameClassName}Delegate.class);
        pool.drain();
    }
}