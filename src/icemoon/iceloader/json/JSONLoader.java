package icemoon.iceloader.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.google.gson.JsonParser;
import com.jme3.asset.AssetInfo;
import com.jme3.asset.AssetLoader;

public class JSONLoader implements AssetLoader {

	public Object load(AssetInfo assetInfo) throws IOException {
		InputStream file = assetInfo.openStream();
		try {
			return new JsonParser().parse(new InputStreamReader(file, "UTF-8"));
		} finally {
			file.close();
		}
	}
}
