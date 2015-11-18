SECTION = "devel/chicken"
DESCRIPTION = "Serialization/unserialization of PHP data types."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://php-s11n.meta;md5=6a5ae91903ecbbb747c44c11ac653e49"
DEPENDS_append_class-cross = " chicken-egg-regex-literals-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-literals-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex-literals nativesdk-chicken-egg-regex chicken-egg-regex-literals-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex-literals chicken-egg-regex chicken-egg-regex-literals-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex-literals chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/php-s11n/php-s11n-${PV}.tar.gz"

SRC_URI[md5sum] = "b8b2f6ec8cb702c3cd3403f40cb9bf2e"
SRC_URI[sha256sum] = "c7a24f5d196812b5a0b63ab942bb6c8cf3e6fab0c149a909173d9754459cfe7c"

S = "${WORKDIR}/php-s11n-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
