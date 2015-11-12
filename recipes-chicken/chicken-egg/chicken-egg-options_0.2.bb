SECTION = "devel/chicken"
DESCRIPTION = "Options a la ML"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://options.meta;md5=a132ea3edcd00be34ae3ec57b9062d18"
DEPENDS_append_class-cross = " chicken-egg-datatype-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-datatype-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-datatype chicken-egg-datatype-crosssdk"
DEPENDS = " chicken-egg-datatype chicken-egg-datatype-cross"
RDEPENDS_${PN} = " chicken-egg-datatype"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/options/options-${PV}.tar.gz"

SRC_URI[md5sum] = "318fde3be813d042bd4962a564f0038a"
SRC_URI[sha256sum] = "1c2e2fd98d91ca048e8ad2f46d483a8ce0757fb571f1fd726e37f1c5417c2c76"

S = "${WORKDIR}/options-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
