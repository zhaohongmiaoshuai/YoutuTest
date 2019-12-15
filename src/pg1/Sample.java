package pg1;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import com.baidu.aip.ocr.*;

public class Sample {
	//����APPID/AK/SK
	public static final String APP_ID = "18029253";
	public static final String API_KEY = "SNPNGXzThMUd9GKeraGAMXV9";
	public static final String SECRET_KEY = "eCjX5plzlyZmzPulFqH7ET0jCiVyK0Ed";

	public static void main(String[] args) {
		// ��ʼ��һ��AipOcr
		AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

		// ��ѡ�������������Ӳ���
//		client.setConnectionTimeoutInMillis(2000);
//		client.setSocketTimeoutInMillis(60000);

		// ��ѡ�����ô����������ַ, http��socket��ѡһ�����߾�������
//		client.setHttpProxy("proxy_host", proxy_port);  // ����http����
//		client.setSocketProxy("proxy_host", proxy_port);  // ����socket����

		// ��ѡ������log4j��־�����ʽ���������ã���ʹ��Ĭ������
		// Ҳ����ֱ��ͨ��jvm�����������ô˻�������
//		System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

		// ���ýӿ�
		String path = "F:\\j2eeworkspace\\YoutuTest\\src\\pg1\\test.jpg";
		JSONObject res = client.handwriting(path, new HashMap<String, String>());
		
		JSONArray result = (JSONArray) res.get("words_result");
		for (int i = 0; i < result.length(); i++) {
			System.out.println(((JSONObject)result.get(i)).get("words"));
		}
		
//		System.out.println(res.get("words_result"));
//		System.out.println(res.toString(2));

	}
}
