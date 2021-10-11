package opp.io;

import java.io.*;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles {

    public static void main(String[] args) {

        String fileName = "files/archive.zip";

        File file = new File(fileName);

        try (OutputStream outputStream = new FileOutputStream(file);
             ZipOutputStream gzipOutputStream = new ZipOutputStream(outputStream);
             DataOutputStream dataOutputStream = new DataOutputStream(gzipOutputStream)
        ) {
            ZipEntry dirEntry = new ZipEntry("/bin");
            gzipOutputStream.putNextEntry(dirEntry);

            ZipEntry binFileEntry = new ZipEntry("bin/file.txt");
            gzipOutputStream.putNextEntry(binFileEntry);

            dataOutputStream.writeUTF("");

        }
        catch (IOException ex){

        }
    }
}
