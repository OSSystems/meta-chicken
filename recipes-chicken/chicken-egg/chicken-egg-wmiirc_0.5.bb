SECTION = "devel/chicken"
DESCRIPTION = "A library for writing wmii configuration scripts"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://wmiirc.meta;md5=1432366e6f5b037b936ee7b072d1f3cb"
DEPENDS_append_class-cross = " chicken-egg-9p-cross chicken-egg-unix-sockets-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-9p-crosssdk chicken-egg-unix-sockets-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-9p nativesdk-chicken-egg-unix-sockets chicken-egg-9p-crosssdk chicken-egg-unix-sockets-crosssdk"
DEPENDS = " chicken-egg-9p chicken-egg-unix-sockets chicken-egg-9p-cross chicken-egg-unix-sockets-cross"
RDEPENDS_${PN} = " chicken-egg-9p chicken-egg-unix-sockets"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/wmiirc/wmiirc-${PV}.tar.gz"

SRC_URI[md5sum] = "0f3016b3e3c00a1f4f08246ebfca11e2"
SRC_URI[sha256sum] = "976ce74bf6859a4ba2edd253f5558655a3d7a9fe1a3f0b911726aad97d32f062"

S = "${WORKDIR}/wmiirc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
