SECTION = "devel/chicken"
DESCRIPTION = "RIPE Message Digest"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ripemd.meta;md5=3378bbc239b1d3e64ee3177c4e195bd1"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-message-digest-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-message-digest-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-message-digest chicken-egg-setup-helper-crosssdk chicken-egg-message-digest-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-message-digest chicken-egg-setup-helper-cross chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-message-digest"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ripemd/ripemd-${PV}.tar.gz"

SRC_URI[md5sum] = "e31b9b6674dd94988775161b16d766af"
SRC_URI[sha256sum] = "1d56afb237d2f752e800574729ba926c09670211906231c4f1b91bb01ba7b24c"

S = "${WORKDIR}/ripemd-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
