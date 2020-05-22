
public class FileDownloaderProxy implements Downloader{
    private FileDownloader fileDownloader;
    @Override
    public void download() {
        fileDownloader = new FileDownloader();
        fileDownloader.download();

    }
}
