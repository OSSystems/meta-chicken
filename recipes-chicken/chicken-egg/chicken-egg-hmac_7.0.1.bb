SECTION = "devel/chicken"
DESCRIPTION = "HMAC provides a HMAC using the message-digest interface."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hmac.meta;md5=24314731b32c628746335185399e417c"
DEPENDS_append_class-cross = " chicken-egg-message-digest-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-message-digest-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-message-digest chicken-egg-message-digest-crosssdk"
DEPENDS = " chicken-egg-message-digest chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-message-digest"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hmac/hmac-${PV}.tar.gz"

SRC_URI[md5sum] = "52c879b80b54927e035c21a48962faab"
SRC_URI[sha256sum] = "1c9ddbaf0f8b6ad8247024b396c55a7890f7714c534588b61ff944deaf35d486"

S = "${WORKDIR}/hmac-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
