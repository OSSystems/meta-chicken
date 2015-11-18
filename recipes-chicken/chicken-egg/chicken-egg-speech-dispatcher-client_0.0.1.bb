SECTION = "devel/chicken"
DESCRIPTION = "Implementation of Speech Dispatcher's SSIP protocol"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://speech-dispatcher-client.meta;md5=699bdfea4dcd2def5bfea765fec35e4d"
DEPENDS_append_class-cross = " chicken-egg-unix-sockets-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-unix-sockets-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-unix-sockets chicken-egg-unix-sockets-crosssdk"
DEPENDS = " chicken-egg-unix-sockets chicken-egg-unix-sockets-cross"
RDEPENDS_${PN} = " chicken-egg-unix-sockets"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/speech-dispatcher-client/speech-dispatcher-client-${PV}.tar.gz"

SRC_URI[md5sum] = "a9d3b4c94968d63915da52c65bce6bbd"
SRC_URI[sha256sum] = "2423dda0d70e2597a0f83c103145f9204ddd955b60bac84d7798760163daef41"

S = "${WORKDIR}/speech-dispatcher-client-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
