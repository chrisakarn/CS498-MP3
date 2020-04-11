package jenkins.model;

public class idFromFilenameTest {

@Test
public void idFromFilenamWorked() throws Exception{
    final String curlJobName = stringUtil.idFromFilename(true, "itWorked");
}
@Test
public void idFromFilenameFailed() throws Exception{
    final String curlJobName = stringUtil.idFromFilename(false,"itFailed");
}
}

