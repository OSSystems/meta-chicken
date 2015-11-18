SECTION = "devel/chicken"
DESCRIPTION = "Convenient string manipulations"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://s.meta;md5=3542645c0334f83a51282b13fb62b406"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/s/s-${PV}.tar.gz"

SRC_URI[md5sum] = "2ba45f7e3372690eb208407651fa6f85"
SRC_URI[sha256sum] = "f40ea74bcbcbbb4153ec87d4c7fb21f0ade0de04b039d283edf1aff455fb47ef"

S = "${WORKDIR}/s-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
