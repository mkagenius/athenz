//
// This file generated by rdl 1.4.14. Do not modify!
//
package com.yahoo.athenz.zms;

import com.yahoo.rdl.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
// ZMSHandler is the interface that the service implementation must implement
//
public interface ZMSHandler { 
    public Domain getDomain(ResourceContext context, String domain);
    public DomainList getDomainList(ResourceContext context, Integer limit, String skip, String prefix, Integer depth, String account, Integer productId, String roleMember, String roleName, String modifiedSince);
    public Domain postTopLevelDomain(ResourceContext context, String auditRef, TopLevelDomain detail);
    public Domain postSubDomain(ResourceContext context, String parent, String auditRef, SubDomain detail);
    public Domain postUserDomain(ResourceContext context, String name, String auditRef, UserDomain detail);
    public TopLevelDomain deleteTopLevelDomain(ResourceContext context, String name, String auditRef);
    public SubDomain deleteSubDomain(ResourceContext context, String parent, String name, String auditRef);
    public UserDomain deleteUserDomain(ResourceContext context, String name, String auditRef);
    public Domain putDomainMeta(ResourceContext context, String name, String auditRef, DomainMeta detail);
    public DomainTemplate putDomainTemplate(ResourceContext context, String name, String auditRef, DomainTemplate template);
    public DomainTemplateList getDomainTemplateList(ResourceContext context, String name);
    public DomainTemplate deleteDomainTemplate(ResourceContext context, String name, String template, String auditRef);
    public DomainDataCheck getDomainDataCheck(ResourceContext context, String domainName);
    public Entity putEntity(ResourceContext context, String domainName, String entityName, String auditRef, Entity entity);
    public Entity getEntity(ResourceContext context, String domainName, String entityName);
    public Entity deleteEntity(ResourceContext context, String domainName, String entityName, String auditRef);
    public EntityList getEntityList(ResourceContext context, String domainName);
    public RoleList getRoleList(ResourceContext context, String domainName, Integer limit, String skip);
    public Roles getRoles(ResourceContext context, String domainName, Boolean members);
    public Role getRole(ResourceContext context, String domainName, String roleName, Boolean auditLog, Boolean expand);
    public Role putRole(ResourceContext context, String domainName, String roleName, String auditRef, Role role);
    public Role deleteRole(ResourceContext context, String domainName, String roleName, String auditRef);
    public Membership getMembership(ResourceContext context, String domainName, String roleName, String memberName);
    public Membership putMembership(ResourceContext context, String domainName, String roleName, String memberName, String auditRef, Membership membership);
    public Membership deleteMembership(ResourceContext context, String domainName, String roleName, String memberName, String auditRef);
    public DefaultAdmins putDefaultAdmins(ResourceContext context, String domainName, String auditRef, DefaultAdmins defaultAdmins);
    public PolicyList getPolicyList(ResourceContext context, String domainName, Integer limit, String skip);
    public Policies getPolicies(ResourceContext context, String domainName, Boolean assertions);
    public Policy getPolicy(ResourceContext context, String domainName, String policyName);
    public Policy putPolicy(ResourceContext context, String domainName, String policyName, String auditRef, Policy policy);
    public Policy deletePolicy(ResourceContext context, String domainName, String policyName, String auditRef);
    public Assertion getAssertion(ResourceContext context, String domainName, String policyName, Long assertionId);
    public Assertion putAssertion(ResourceContext context, String domainName, String policyName, String auditRef, Assertion assertion);
    public Assertion deleteAssertion(ResourceContext context, String domainName, String policyName, Long assertionId, String auditRef);
    public ServiceIdentity putServiceIdentity(ResourceContext context, String domain, String service, String auditRef, ServiceIdentity detail);
    public ServiceIdentity getServiceIdentity(ResourceContext context, String domain, String service);
    public ServiceIdentity deleteServiceIdentity(ResourceContext context, String domain, String service, String auditRef);
    public ServiceIdentities getServiceIdentities(ResourceContext context, String domainName, Boolean publickeys, Boolean hosts);
    public ServiceIdentityList getServiceIdentityList(ResourceContext context, String domainName, Integer limit, String skip);
    public PublicKeyEntry getPublicKeyEntry(ResourceContext context, String domain, String service, String id);
    public PublicKeyEntry putPublicKeyEntry(ResourceContext context, String domain, String service, String id, String auditRef, PublicKeyEntry publicKeyEntry);
    public PublicKeyEntry deletePublicKeyEntry(ResourceContext context, String domain, String service, String id, String auditRef);
    public Tenancy putTenancy(ResourceContext context, String domain, String service, String auditRef, Tenancy detail);
    public Tenancy getTenancy(ResourceContext context, String domain, String service);
    public Tenancy deleteTenancy(ResourceContext context, String domain, String service, String auditRef);
    public TenancyResourceGroup putTenancyResourceGroup(ResourceContext context, String domain, String service, String resourceGroup, String auditRef, TenancyResourceGroup detail);
    public TenancyResourceGroup deleteTenancyResourceGroup(ResourceContext context, String domain, String service, String resourceGroup, String auditRef);
    public TenantRoles putTenantRoles(ResourceContext context, String domain, String service, String tenantDomain, String auditRef, TenantRoles detail);
    public TenantRoles getTenantRoles(ResourceContext context, String domain, String service, String tenantDomain);
    public TenantRoles deleteTenantRoles(ResourceContext context, String domain, String service, String tenantDomain, String auditRef);
    public TenantResourceGroupRoles putTenantResourceGroupRoles(ResourceContext context, String domain, String service, String tenantDomain, String resourceGroup, String auditRef, TenantResourceGroupRoles detail);
    public TenantResourceGroupRoles getTenantResourceGroupRoles(ResourceContext context, String domain, String service, String tenantDomain, String resourceGroup);
    public TenantResourceGroupRoles deleteTenantResourceGroupRoles(ResourceContext context, String domain, String service, String tenantDomain, String resourceGroup, String auditRef);
    public ProviderResourceGroupRoles putProviderResourceGroupRoles(ResourceContext context, String tenantDomain, String provDomain, String provService, String resourceGroup, String auditRef, ProviderResourceGroupRoles detail);
    public ProviderResourceGroupRoles getProviderResourceGroupRoles(ResourceContext context, String tenantDomain, String provDomain, String provService, String resourceGroup);
    public ProviderResourceGroupRoles deleteProviderResourceGroupRoles(ResourceContext context, String tenantDomain, String provDomain, String provService, String resourceGroup, String auditRef);
    public Access getAccess(ResourceContext context, String action, String resource, String domain, String checkPrincipal);
    public Access getAccessExt(ResourceContext context, String action, String resource, String domain, String checkPrincipal);
    public ResourceAccessList getResourceAccessList(ResourceContext context, String principal, String action);
    public void getSignedDomains(ResourceContext context, String domain, String metaOnly, String matchingTag, GetSignedDomainsResult result);
    public UserToken getUserToken(ResourceContext context, String userName, String serviceNames, Boolean header);
    public UserToken optionsUserToken(ResourceContext context, String userName, String serviceNames);
    public ServicePrincipal getServicePrincipal(ResourceContext context);
    public ServerTemplateList getServerTemplateList(ResourceContext context);
    public Template getTemplate(ResourceContext context, String template);
    public UserList getUserList(ResourceContext context);
    public User deleteUser(ResourceContext context, String name, String auditRef);
    public Quota getQuota(ResourceContext context, String name);
    public Quota putQuota(ResourceContext context, String name, String auditRef, Quota quota);
    public Quota deleteQuota(ResourceContext context, String name, String auditRef);
    public Schema getRdlSchema(ResourceContext context);
    public ResourceContext newResourceContext(HttpServletRequest request, HttpServletResponse response);
}
