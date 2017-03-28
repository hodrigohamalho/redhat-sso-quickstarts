/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.quickstart.page;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author <a href="mailto:bruno@abstractj.org">Bruno Oliveira</a>
 */
public class ProfilePage {

    @FindBy(name = "profileBtn")
    private WebElement profileButton;

    @FindBy(name = "tokenBtn")
    private WebElement tokenButton;

    @FindBy(name = "logoutBtn")
    private WebElement logoutButton;

    @FindBy(name = "accountBtn")
    private WebElement accountButton;

    @FindBy(id = "token-content")
    private WebElement tokenContent;

    //<span id="username">admin</span>
    public void clickProfile() {
        profileButton.click();
    }

    //check if contains the word admin and jti?
    public void clickToken() {
        tokenButton.click();
    }

    //assert that <div class="message">Please login</div>
    public void clickLogout() {
        logoutButton.click();
    }

    //Assert the title has changed
    public void clickAccount() {
        accountButton.click();
    }

    public JsonObject getTokenContent() throws Exception {
        return new JsonParser().parse(tokenContent.getText()).getAsJsonObject();
    }

}
