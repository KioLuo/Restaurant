package com.netease;

public class Kitchen {
    public static String makeNoodles(String vegetable) {
        if (vegetable == null) {
	    vegetable = "tomato";
	}

	StringBuffer s = new StringBuffer();
	s.append("<html><body>\n");
	s.append("<h1> Noodles with");
	s.append(vegetable);
	s.append("</h1>\n");
	s.append("</body></html>");

	return s.toString();
    }
}
