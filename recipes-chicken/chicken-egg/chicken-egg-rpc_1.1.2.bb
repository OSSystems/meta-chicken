SECTION = "devel/chicken"
DESCRIPTION = "A flexible peer-to-peer RPC system."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://rpc.meta;md5=0b0c34c5412c36ae17cc1ba36ca15a61"
DEPENDS_append_class-cross = " chicken-egg-tcp-server-cross chicken-egg-s11n-cross chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-tcp-server-crosssdk chicken-egg-s11n-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-tcp-server nativesdk-chicken-egg-s11n nativesdk-chicken-egg-matchable chicken-egg-tcp-server-crosssdk chicken-egg-s11n-crosssdk chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-tcp-server chicken-egg-s11n chicken-egg-matchable chicken-egg-tcp-server-cross chicken-egg-s11n-cross chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-tcp-server chicken-egg-s11n chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/rpc/rpc-${PV}.tar.gz"

SRC_URI[md5sum] = "693e1641ddd7f304b96365a34cd55ff2"
SRC_URI[sha256sum] = "e26bd040c028baa46f7a2b11d508ac1a29c3dc3f2bd999f0bbc29f30708372b2"

S = "${WORKDIR}/rpc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
