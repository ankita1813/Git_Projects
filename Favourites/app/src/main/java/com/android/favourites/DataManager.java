//package com.android.favourites;
//
//import android.app.IntentService;
//import android.content.Context;
//import android.content.Intent;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.net.URL;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//
///**
// * Created by ankita on 29/8/17.
// */
//public class DataManager extends IntentService{
//
//    private static final String URL = "url";
//
//    public DataManager() {
//        super("DataManager");
//    }
//
//    private String readAll(Reader rd) throws IOException {
//        StringBuilder sb = new StringBuilder();
//        int cp;
//        while ((cp = rd.read()) != -1) {
//            sb.append((char) cp);
//        }
//        return sb.toString();
//    }
//
//    public void readJsonFromUrl(String url)  {
//        InputStream is = null;
//        try {
//            is = new URL(url).openStream();
//            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
//            String jsonText = readAll(rd);
//            initFavorite(jsonText);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(is != null)
//                    is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private void initFavorite(String jsonStr){
//        ArrayList<Favourite> list = new ArrayList<>();
//        if(jsonStr != null){
//            try {
//                JSONArray jsonArray = new JSONArray(jsonStr);
//                for(int i = 0; i < jsonArray.length(); i++){
//                    JSONObject jsonObject = jsonArray.getJSONObject(i);
//                    list.add(new Favourite(jsonObject));
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
//        Intent intent = new Intent();
//        intent.putParcelableArrayListExtra("data", list);
//        sendBroadcast(intent);
//    }
//
//    public static final void execute(Context context, String url){
//        final Intent intent = new Intent(context, DataManager.class);
//        intent.putExtra(URL, url);
//        context.startService(intent);
//    }
//
//    @Override
//    protected void onHandleIntent(Intent intent) {
//        final String url = intent.getStringExtra(URL);
//        readJsonFromUrl(url);
//    }
//}
