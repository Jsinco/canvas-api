package edu.ksu.canvas;

import edu.ksu.canvas.config.CommonTestConfig;
import edu.ksu.canvas.interfaces.CanvasMessenger;
import edu.ksu.canvas.net.FakeRestClient;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonTestConfig.class})
@ActiveProfiles("dev")
public class CanvasTestBase {
    public static final String SOME_OAUTH_TOKEN = "token";
    @Autowired
    protected CanvasMessenger mockCanvasMessenger;
    @Autowired
    protected String baseUrl;
    @Autowired
    protected FakeRestClient fakeRestClient;
    protected Integer apiVersion = 1;
}