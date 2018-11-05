package com.cweb.Controller;

import java.io.File;
import java.util.HashMap;

import org.junit.Test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class See {

	@Test
	public void MakeQRcode(){
		int width = 300;
		int height = 300;
		String format = "png";
		String contcent = "http://f2m2476991.iask.in/SearchRS/GetProductById";
		//定义二维码参数
		HashMap hints = new HashMap();
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		hints.put(EncodeHintType.ERROR_CORRECTION,ErrorCorrectionLevel.M);
		hints.put(EncodeHintType.MARGIN,2);
		
		//生成二维码
		try {
			BitMatrix bitMatrix = new MultiFormatWriter().encode(contcent, BarcodeFormat.QR_CODE, width, height, hints);
		
			File file = new File("E:/img.png");
			
			MatrixToImageWriter.writeToFile(bitMatrix, format, file);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
