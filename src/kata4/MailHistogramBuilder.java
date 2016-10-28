package kata4;

import java.util.ArrayList;

public class MailHistogramBuilder {
    public static Histogram<String> build(ArrayList<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mails : mail) {
            histo.increment(new Mail(mails).getDomain());
        }
        return histo;
    }
}
