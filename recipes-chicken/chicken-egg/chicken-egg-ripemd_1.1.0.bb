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

SRC_URI[md5sum] = "6064a68a6807ccb7fcac2313f0a7494e"
SRC_URI[sha256sum] = "5b97199b4acd7829e51ff9071105053edd995ca7103eb4749bd1eade555e65ad"

S = "${WORKDIR}/ripemd-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
