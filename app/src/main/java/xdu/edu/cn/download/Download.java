package xdu.edu.cn.download;

/*import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import xdu.edu.cn.utils.HttpDownloader;

public class Download extends AppCompatActivity {

    private Button downloadTextButton;
    private Button downloadfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        downloadTextButton = (Button) this.findViewById(R.id.downloadtext);
        downloadfileButton = (Button) this.findViewById(R.id.downloadfile);
        downloadTextButton.setOnClickListener(new DownloadTextListener());
        downloadfileButton.setOnClickListener(new DownloadFileListener());
    }

    class DownloadTextListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            HttpDownloader httpDownloader = new HttpDownloader();
            String lrc = httpDownloader.download("http://music.baidu.com/song/490468#");
            System.out.println(lrc);
        }
    }

     class DownloadFileListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            HttpDownloader httpDownloader = new HttpDownloader();
            int result = httpDownloader.downFile("","voa/","a1.mp4");
            System.out.println(result);
        }
    }
}*/

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import xdu.edu.cn.utils.HttpDownloader;
public class Download extends Activity {
    /** Called when the activity is first created. */
    private Button downloadTxtButton;
    private Button downloadMp3Button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        downloadTxtButton = (Button)findViewById(R.id.downloadtext);
        downloadTxtButton.setOnClickListener(new DownloadTxtListener());
        downloadMp3Button = (Button)findViewById(R.id.downloadfile);
        downloadMp3Button.setOnClickListener(new DownloadMp3Listener());
    }

    class DownloadTxtListener implements OnClickListener{

        @Override
        public void onClick(View v) {
            HttpDownloader httpDownloader = new HttpDownloader();
            String lrc = httpDownloader.download("http://www.lrcgc.com/lrc-1480-252753/%E5%BC%A0%E6%9D%B0-%E4%B8%89%E7%94%9F%E4%B8%89%E4%B8%96.lrc");
            System.out.println(lrc);
        }

    }
    class DownloadMp3Listener implements OnClickListener{

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            HttpDownloader httpDownloader = new HttpDownloader();
            int result = httpDownloader.downFile("http://downdb.51voa.com/201702/teachers-find-calm-in-new-program.mp3", "voa/", "a1.mp3");
            System.out.println(result);
        }

    }

}