SECTION = "devel/chicken"
DESCRIPTION = "libudev bindings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://udev.meta;md5=8cfcdb7a78b723c20fa2203479a50290"
DEPENDS_append_class-cross = " udev-native"
DEPENDS_append_class-crosssdk = " udev-native"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-udev"
DEPENDS = " udev"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/udev/udev-${PV}.tar.gz"

SRC_URI[md5sum] = "8e78fea8cf7ec3240cd1202265a89d15"
SRC_URI[sha256sum] = "b4915e27b395f0410daaf3876cdb3d679c1e56e49ae0fb2b12627fdbcb22483a"

S = "${WORKDIR}/udev-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
