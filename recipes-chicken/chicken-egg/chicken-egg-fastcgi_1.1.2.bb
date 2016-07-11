SECTION = "devel/chicken"
DESCRIPTION = "Bindings for the FCGX API of libfcgi"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://fastcgi.meta;md5=d2bf2ead7ef40456e37b1568adf4de73"
DEPENDS_append_class-cross = " fcgi-native"
DEPENDS_append_class-crosssdk = " fcgi-native"
DEPENDS_append_class-nativesdk = " nativesdk-fcgi"
DEPENDS = " fcgi"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fastcgi/fastcgi-${PV}.tar.gz"

SRC_URI[md5sum] = "099af3a79453dab0d18cb8061810ab76"
SRC_URI[sha256sum] = "93d2961397c93b8e5728686250f9b13297a6701a9f36e7365bff6f4aad50b95b"

S = "${WORKDIR}/fastcgi-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
