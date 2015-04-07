package minimal;

import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.capture.DPFPCapture;

/**
 * Created by christian on 7/04/15.
 */
public class DummyClass {

    /**
     * @see DummyClass
     */
    public void hello()
    {
        System.out.println("hello world");
        DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();
    }
}
