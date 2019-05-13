package se.bjurr.prnfb.presentation.dto;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import com.google.common.base.Optional;
import java.util.List;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import se.bjurr.prnfb.http.UrlInvoker.HTTP_METHOD;
import se.bjurr.prnfb.service.PrnfbRenderer.ENCODE_FOR;
import se.bjurr.prnfb.settings.Restricted;
import se.bjurr.prnfb.settings.TRIGGER_IF_MERGE;

@XmlRootElement
@XmlAccessorType(FIELD)
public class NotificationDTO implements Comparable<NotificationDTO>, Restricted {
  private String filterRegexp;
  private String filterString;
  private String injectionUrl;
  private String injectionUrlRegexp;
  private String variableName;
  private String variableRegex;
  private HTTP_METHOD method;
  private String name;
  private String password;
  private String postContent;
  private String projectKey;
  private String proxyPassword;
  private Integer proxyPort;
  private String proxyServer;
  private String proxySchema;
  private String proxyUser;
  private String repositorySlug;
  private TRIGGER_IF_MERGE triggerIfCanMerge;
  private List<String> triggerIgnoreStateList;
  private List<String> triggers;
  private boolean updatePullRequestRefs;
  private String url;
  private String user;
  private UUID uuid;
  private ENCODE_FOR postContentEncoding;
  private String httpVersion;

  public void setPostContentEncoding(final ENCODE_FOR postContentEncoding) {
    this.postContentEncoding = postContentEncoding;
  }

  @Override
  public int compareTo(final NotificationDTO o) {
    return this.name.compareTo(o.name);
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final NotificationDTO other = (NotificationDTO) obj;
    if (filterRegexp == null) {
      if (other.filterRegexp != null) {
        return false;
      }
    } else if (!filterRegexp.equals(other.filterRegexp)) {
      return false;
    }
    if (filterString == null) {
      if (other.filterString != null) {
        return false;
      }
    } else if (!filterString.equals(other.filterString)) {
      return false;
    }
    if (httpVersion == null) {
      if (other.httpVersion != null) {
        return false;
      }
    } else if (!httpVersion.equals(other.httpVersion)) {
      return false;
    }
    if (injectionUrl == null) {
      if (other.injectionUrl != null) {
        return false;
      }
    } else if (!injectionUrl.equals(other.injectionUrl)) {
      return false;
    }
    if (injectionUrlRegexp == null) {
      if (other.injectionUrlRegexp != null) {
        return false;
      }
    } else if (!injectionUrlRegexp.equals(other.injectionUrlRegexp)) {
      return false;
    }
    if (variableName == null) {
      if (other.variableName != null) {
        return false;
      }
    } else if (!variableName.equals(other.variableName)) {
      return false;
    }
    if (variableRegex == null) {
      if (other.variableRegex != null) {
        return false;
      }
    } else if (!variableRegex.equals(other.variableRegex)) {
      return false;
    }
    if (method != other.method) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    if (password == null) {
      if (other.password != null) {
        return false;
      }
    } else if (!password.equals(other.password)) {
      return false;
    }
    if (postContent == null) {
      if (other.postContent != null) {
        return false;
      }
    } else if (!postContent.equals(other.postContent)) {
      return false;
    }
    if (postContentEncoding != other.postContentEncoding) {
      return false;
    }
    if (projectKey == null) {
      if (other.projectKey != null) {
        return false;
      }
    } else if (!projectKey.equals(other.projectKey)) {
      return false;
    }
    if (proxyPassword == null) {
      if (other.proxyPassword != null) {
        return false;
      }
    } else if (!proxyPassword.equals(other.proxyPassword)) {
      return false;
    }
    if (proxyPort == null) {
      if (other.proxyPort != null) {
        return false;
      }
    } else if (!proxyPort.equals(other.proxyPort)) {
      return false;
    }
    if (proxySchema == null) {
      if (other.proxySchema != null) {
        return false;
      }
    } else if (!proxySchema.equals(other.proxySchema)) {
      return false;
    }
    if (proxyServer == null) {
      if (other.proxyServer != null) {
        return false;
      }
    } else if (!proxyServer.equals(other.proxyServer)) {
      return false;
    }
    if (proxyUser == null) {
      if (other.proxyUser != null) {
        return false;
      }
    } else if (!proxyUser.equals(other.proxyUser)) {
      return false;
    }
    if (repositorySlug == null) {
      if (other.repositorySlug != null) {
        return false;
      }
    } else if (!repositorySlug.equals(other.repositorySlug)) {
      return false;
    }
    if (triggerIfCanMerge != other.triggerIfCanMerge) {
      return false;
    }
    if (triggerIgnoreStateList == null) {
      if (other.triggerIgnoreStateList != null) {
        return false;
      }
    } else if (!triggerIgnoreStateList.equals(other.triggerIgnoreStateList)) {
      return false;
    }
    if (triggers == null) {
      if (other.triggers != null) {
        return false;
      }
    } else if (!triggers.equals(other.triggers)) {
      return false;
    }
    if (updatePullRequestRefs != other.updatePullRequestRefs) {
      return false;
    }
    if (url == null) {
      if (other.url != null) {
        return false;
      }
    } else if (!url.equals(other.url)) {
      return false;
    }
    if (user == null) {
      if (other.user != null) {
        return false;
      }
    } else if (!user.equals(other.user)) {
      return false;
    }
    if (uuid == null) {
      if (other.uuid != null) {
        return false;
      }
    } else if (!uuid.equals(other.uuid)) {
      return false;
    }
    return true;
  }

  public String getFilterRegexp() {
    return this.filterRegexp;
  }

  public String getFilterString() {
    return this.filterString;
  }

  public String getInjectionUrl() {
    return this.injectionUrl;
  }

  public String getInjectionUrlRegexp() {
    return this.injectionUrlRegexp;
  }

  public String getVariableName() {
    return this.variableName;
  }

  public String getVariableRegex() {
    return this.variableRegex;
  }

  public HTTP_METHOD getMethod() {
    return this.method;
  }

  public String getName() {
    return this.name;
  }

  public String getPassword() {
    return this.password;
  }

  public String getPostContent() {
    return this.postContent;
  }

  @Override
  public Optional<String> getProjectKey() {
    return Optional.fromNullable(this.projectKey);
  }

  @Override
  public Optional<String> getRepositorySlug() {
    return Optional.fromNullable(this.repositorySlug);
  }

  public String getProxyPassword() {
    return this.proxyPassword;
  }

  public Integer getProxyPort() {
    return this.proxyPort;
  }

  public String getProxyServer() {
    return this.proxyServer;
  }

  public String getProxyUser() {
    return this.proxyUser;
  }

  public TRIGGER_IF_MERGE getTriggerIfCanMerge() {
    return this.triggerIfCanMerge;
  }

  public List<String> getTriggerIgnoreStateList() {
    return this.triggerIgnoreStateList;
  }

  public List<String> getTriggers() {
    return this.triggers;
  }

  public boolean isUpdatePullRequestRefs() {
    return this.updatePullRequestRefs;
  }

  public String getUrl() {
    return this.url;
  }

  public String getUser() {
    return this.user;
  }

  public UUID getUuid() {
    return this.uuid;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (filterRegexp == null ? 0 : filterRegexp.hashCode());
    result = prime * result + (filterString == null ? 0 : filterString.hashCode());
    result = prime * result + (httpVersion == null ? 0 : httpVersion.hashCode());
    result = prime * result + (injectionUrl == null ? 0 : injectionUrl.hashCode());
    result = prime * result + (injectionUrlRegexp == null ? 0 : injectionUrlRegexp.hashCode());
    result = prime * result + (variableName == null ? 0 : variableName.hashCode());
    result = prime * result + (variableRegex == null ? 0 : variableRegex.hashCode());
    result = prime * result + (method == null ? 0 : method.hashCode());
    result = prime * result + (name == null ? 0 : name.hashCode());
    result = prime * result + (password == null ? 0 : password.hashCode());
    result = prime * result + (postContent == null ? 0 : postContent.hashCode());
    result = prime * result + (postContentEncoding == null ? 0 : postContentEncoding.hashCode());
    result = prime * result + (projectKey == null ? 0 : projectKey.hashCode());
    result = prime * result + (proxyPassword == null ? 0 : proxyPassword.hashCode());
    result = prime * result + (proxyPort == null ? 0 : proxyPort.hashCode());
    result = prime * result + (proxySchema == null ? 0 : proxySchema.hashCode());
    result = prime * result + (proxyServer == null ? 0 : proxyServer.hashCode());
    result = prime * result + (proxyUser == null ? 0 : proxyUser.hashCode());
    result = prime * result + (repositorySlug == null ? 0 : repositorySlug.hashCode());
    result = prime * result + (triggerIfCanMerge == null ? 0 : triggerIfCanMerge.hashCode());
    result =
        prime * result + (triggerIgnoreStateList == null ? 0 : triggerIgnoreStateList.hashCode());
    result = prime * result + (triggers == null ? 0 : triggers.hashCode());
    result = prime * result + (updatePullRequestRefs ? 1231 : 1237);
    result = prime * result + (url == null ? 0 : url.hashCode());
    result = prime * result + (user == null ? 0 : user.hashCode());
    result = prime * result + (uuid == null ? 0 : uuid.hashCode());
    return result;
  }

  public void setFilterRegexp(final String filterRegexp) {
    this.filterRegexp = filterRegexp;
  }

  public void setFilterString(final String filterString) {
    this.filterString = filterString;
  }

  public void setInjectionUrl(final String injectionUrl) {
    this.injectionUrl = injectionUrl;
  }

  public void setInjectionUrlRegexp(final String injectionUrlRegexp) {
    this.injectionUrlRegexp = injectionUrlRegexp;
  }

  public void setVariableName(final String variableName) {
    this.variableName = variableName;
  }

  public void setVariableRegex(final String variableRegex) {
    this.variableRegex = variableRegex;
  }

  public void setMethod(final HTTP_METHOD method) {
    this.method = method;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public void setPostContent(final String postContent) {
    this.postContent = postContent;
  }

  public void setProjectKey(final String projectKey) {
    this.projectKey = projectKey;
  }

  public void setProxyPassword(final String proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  public void setProxyPort(final Integer proxyPort) {
    this.proxyPort = proxyPort;
  }

  public void setProxyServer(final String proxyServer) {
    this.proxyServer = proxyServer;
  }

  public void setProxyUser(final String proxyUser) {
    this.proxyUser = proxyUser;
  }

  public void setRepositorySlug(final String repositorySlug) {
    this.repositorySlug = repositorySlug;
  }

  public void setTriggerIfCanMerge(final TRIGGER_IF_MERGE triggerIfCanMerge) {
    this.triggerIfCanMerge = triggerIfCanMerge;
  }

  public void setTriggerIgnoreStateList(final List<String> triggerIgnoreStateList) {
    this.triggerIgnoreStateList = triggerIgnoreStateList;
  }

  public void setTriggers(final List<String> triggers) {
    this.triggers = triggers;
  }

  public void setUpdatePullRequestRefs(final boolean updatePullRequestRefs) {
    this.updatePullRequestRefs = updatePullRequestRefs;
  }

  public void setUrl(final String url) {
    this.url = url;
  }

  public void setUser(final String user) {
    this.user = user;
  }

  public void setUuid(final UUID uuid) {
    this.uuid = uuid;
  }

  public ENCODE_FOR getPostContentEncoding() {
    return postContentEncoding;
  }

  public void setProxySchema(final String proxySchema) {
    this.proxySchema = proxySchema;
  }

  public String getProxySchema() {
    return proxySchema;
  }

  public String getHttpVersion() {
    return httpVersion;
  }

  public void setHttpVersion(final String httpVersion) {
    this.httpVersion = httpVersion;
  }

  @Override
  public String toString() {
    return "NotificationDTO [filterRegexp="
        + filterRegexp
        + ", filterString="
        + filterString
        + ", injectionUrl="
        + injectionUrl
        + ", injectionUrlRegexp="
        + injectionUrlRegexp
        + ", variableName="
        + variableName
        + ", variableRegex="
        + variableRegex
        + ", method="
        + method
        + ", name="
        + name
        + ", password="
        + password
        + ", postContent="
        + postContent
        + ", projectKey="
        + projectKey
        + ", proxyPassword="
        + proxyPassword
        + ", proxyPort="
        + proxyPort
        + ", proxyServer="
        + proxyServer
        + ", proxySchema="
        + proxySchema
        + ", proxyUser="
        + proxyUser
        + ", repositorySlug="
        + repositorySlug
        + ", triggerIfCanMerge="
        + triggerIfCanMerge
        + ", triggerIgnoreStateList="
        + triggerIgnoreStateList
        + ", triggers="
        + triggers
        + ", updatePullRequestRefs="
        + updatePullRequestRefs
        + ", url="
        + url
        + ", user="
        + user
        + ", uuid="
        + uuid
        + ", postContentEncoding="
        + postContentEncoding
        + ", httpVersion="
        + httpVersion
        + "]";
  }
}
