import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

import java.time.LocalDateTime;

@Mojo(name = "sayhello")
public class HelloMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException {
        getLog().info("Hello, today is " + DateFormatterUtil.beautyDate(LocalDateTime.now(), "yyyy-MM-dd HH:mm:ss"));
    }
}
