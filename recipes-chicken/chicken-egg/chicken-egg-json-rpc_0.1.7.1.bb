SECTION = "devel/chicken"
DESCRIPTION = "JSON RPC client/server implementation"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://json-rpc.meta;md5=54862238169ce4b3e8fc3eac1e0493e4"
DEPENDS_append_class-cross = " chicken-egg-medea-cross chicken-egg-mailbox-threads-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-medea-crosssdk chicken-egg-mailbox-threads-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-medea nativesdk-chicken-egg-mailbox-threads chicken-egg-medea-crosssdk chicken-egg-mailbox-threads-crosssdk"
DEPENDS = " chicken-egg-medea chicken-egg-mailbox-threads chicken-egg-medea-cross chicken-egg-mailbox-threads-cross"
RDEPENDS_${PN} = " chicken-egg-medea chicken-egg-mailbox-threads"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/json-rpc/json-rpc-${PV}.tar.gz"

SRC_URI[md5sum] = "676823752a1cae6b1b202b3a64eb07f1"
SRC_URI[sha256sum] = "dadb5c07b1ae23e5caf77738da959783aa9516435deeba1a7b72e9d48740634d"

S = "${WORKDIR}/json-rpc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
