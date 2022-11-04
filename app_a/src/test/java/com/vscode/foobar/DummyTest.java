package com.vscode.foobar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class DummyTest extends JpaIntegrationTestBase {

    @Value("${my.property}")
    private String myProperty;

    @Test
    public void test() {
        Assertions.assertEquals("foobar", myProperty);
    }

}
