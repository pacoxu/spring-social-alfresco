package org.springframework.social.alfresco.connect;

import org.springframework.social.ServiceProvider;
import org.springframework.social.alfresco.api.Alfresco;
import org.springframework.social.alfresco.api.impl.BasicAuthAlfrescoTemplate;

public class BasicAuthServiceProvider implements ServiceProvider<Alfresco>
{
	private String host;
	private int port;
	private String username;
	private String password;

	public BasicAuthServiceProvider(String host, int port, String username, String password)
	{
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	public Alfresco getApi()
	{
        return new BasicAuthAlfrescoTemplate(host, port, username, password);
	}
}