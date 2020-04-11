package jenkins.model;

public class idFromFilenameTest {

@Test
public void idFromFilenamWorked() throws Exception{
    final String curlJobName = stringUtil.idFromFilename(true, "ItWorked");
}
@Test
public void idFromFilenameFailed() throws Exception{
    final String curlJobName = stringUtil.idFromFilename(false,"ItFailed");
}
}

