SECTION = "devel/chicken"
DESCRIPTION = "Bindings for the FCGX API of libfcgi"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fastcgi.meta;md5=d2bf2ead7ef40456e37b1568adf4de73"
DEPENDS_append_class-cross = " fcgi-native"
DEPENDS_append_class-crosssdk = " fcgi-native"
DEPENDS = " fcgi"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fastcgi/fastcgi-${PV}.tar.gz"

SRC_URI[md5sum] = "c22e09652f7463d557bc51e85ca623c5"
SRC_URI[sha256sum] = "6a14745aff000b52e0737264463ff1aa1f373d9b3011899c9a363627792c4e04"

S = "${WORKDIR}/fastcgi-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
