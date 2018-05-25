<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
    <soapenv:Header>
        <soaHeader>
            <reqTime>${reqTime}</reqTime>
            <appId>${appId}</appId>
        </soaHeader>
    </soapenv:Header>
    <soapenv:Body>
        <processRequest>
            <requestHeader>
                <HD_AppId>${appId}</HD_AppId>
                <HD_Adrr>${addr!"地址没有!"}</HD_Adrr>
                <#if tel??>
                  <HD_Tel>${tel}</HD_Tel>
                </#if>
            </requestHeader>
            <requestBody>
                <name>${name}</name>
                <code>${code}</code>
            </requestBody>
        </processRequest>
    </soapenv:Body>
</soapenv:Envelope>