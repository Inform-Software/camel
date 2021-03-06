/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcr;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JcrEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JcrEndpoint target = (JcrEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "deep": target.setDeep(property(camelContext, boolean.class, value)); return true;
        case "eventtypes":
        case "eventTypes": target.setEventTypes(property(camelContext, int.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nolocal":
        case "noLocal": target.setNoLocal(property(camelContext, boolean.class, value)); return true;
        case "nodetypenames":
        case "nodeTypeNames": target.setNodeTypeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sessionlivecheckinterval":
        case "sessionLiveCheckInterval": target.setSessionLiveCheckInterval(property(camelContext, long.class, value)); return true;
        case "sessionlivecheckintervalonstart":
        case "sessionLiveCheckIntervalOnStart": target.setSessionLiveCheckIntervalOnStart(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "uuids": target.setUuids(property(camelContext, java.lang.String.class, value)); return true;
        case "workspacename":
        case "workspaceName": target.setWorkspaceName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("deep", boolean.class);
        answer.put("eventTypes", int.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("noLocal", boolean.class);
        answer.put("nodeTypeNames", java.lang.String.class);
        answer.put("password", java.lang.String.class);
        answer.put("sessionLiveCheckInterval", long.class);
        answer.put("sessionLiveCheckIntervalOnStart", long.class);
        answer.put("synchronous", boolean.class);
        answer.put("username", java.lang.String.class);
        answer.put("uuids", java.lang.String.class);
        answer.put("workspaceName", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JcrEndpoint target = (JcrEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "deep": return target.isDeep();
        case "eventtypes":
        case "eventTypes": return target.getEventTypes();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nolocal":
        case "noLocal": return target.isNoLocal();
        case "nodetypenames":
        case "nodeTypeNames": return target.getNodeTypeNames();
        case "password": return target.getPassword();
        case "sessionlivecheckinterval":
        case "sessionLiveCheckInterval": return target.getSessionLiveCheckInterval();
        case "sessionlivecheckintervalonstart":
        case "sessionLiveCheckIntervalOnStart": return target.getSessionLiveCheckIntervalOnStart();
        case "synchronous": return target.isSynchronous();
        case "username": return target.getUsername();
        case "uuids": return target.getUuids();
        case "workspacename":
        case "workspaceName": return target.getWorkspaceName();
        default: return null;
        }
    }
}

