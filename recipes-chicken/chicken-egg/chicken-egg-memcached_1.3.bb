SECTION = "devel/chicken"
DESCRIPTION = "Client interface to the Memcached protocol."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://memcached.meta;md5=bfe1c09a5b91a2d9869d535bcfc063e4"
DEPENDS_append_class-cross = " chicken-egg-s11n-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-s11n-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-s11n chicken-egg-s11n-crosssdk"
DEPENDS = " chicken-egg-s11n chicken-egg-s11n-cross"
RDEPENDS_${PN} = " chicken-egg-s11n"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/memcached/memcached-${PV}.tar.gz"

SRC_URI[md5sum] = "ad85d452059346e3d1c86ff448f2ed7b"
SRC_URI[sha256sum] = "1b45da189fb156ed26a6008f16f615c8636a69bb680f376b9b116a8eee109404"

S = "${WORKDIR}/memcached-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
