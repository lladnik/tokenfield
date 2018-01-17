package org.vaadin.v7.tokenfield.client.ui;

import com.vaadin.shared.communication.ServerRpc;

public interface TokenFieldServerRpc extends ServerRpc {

    public void deleteToken();
}
