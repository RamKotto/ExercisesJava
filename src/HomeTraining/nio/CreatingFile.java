package HomeTraining.nio;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.*;
import java.util.UUID;

public class CreatingFile {
    private static String HOME = System.getProperty("user.home");

    @Test
    public void givenFilePath_whenCreatesNewFile_thenCorrect() throws IOException {
        String fileName = "myfile_" + UUID.randomUUID() + ".txt";
        System.out.println(fileName);
        Path p = Paths.get(HOME + "/" + fileName);
        System.out.println(p);
        Assert.assertFalse(Files.exists(p));

        Files.createFile(p);

        Assert.assertTrue(Files.exists(p));
    }

    @Test
    public void givenDirPath_whenCreatesNewDir_thenCorrect() throws IOException {
        String dirName = "myDir_" + UUID.randomUUID().toString();
        Path p = Paths.get(HOME + "/" + dirName);
        Assert.assertFalse(Files.exists(p));

        Files.createDirectory(p);

        Assert.assertTrue(Files.exists(p));
        Assert.assertFalse(Files.isRegularFile(p));
        Assert.assertTrue(Files.isDirectory(p));
    }


}
