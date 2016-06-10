SECTION = "devel/chicken"
DESCRIPTION = "Implements LDAP bind for authentication using OpenLDAP"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ldap-bind.meta;md5=79cc45fbec4c729a32e3df49d8b34f3e"
DEPENDS_append_class-cross = " openldap-native"
DEPENDS_append_class-crosssdk = " openldap-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-openldap"
DEPENDS = " openldap"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ldap-bind/ldap-bind-${PV}.tar.gz"

SRC_URI[md5sum] = "cb8a894520311aeb8b98ff718545307f"
SRC_URI[sha256sum] = "1018ad2815154972179ada864e83cd70bfd2a79a9704fe191ea047f4f11a0481"

S = "${WORKDIR}/ldap-bind-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
