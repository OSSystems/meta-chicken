SECTION = "devel/chicken"
DESCRIPTION = "Simple interface/implementation abstraction"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://interfaces.meta;md5=3bbeb0826787983346fc4d4b81ac1ad0"
DEPENDS_append_class-cross = " chicken-egg-records-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-records-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-records chicken-egg-records-crosssdk"
DEPENDS = " chicken-egg-records chicken-egg-records-cross"
RDEPENDS_${PN} = " chicken-egg-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/interfaces/interfaces-${PV}.tar.gz"

SRC_URI[md5sum] = "3462454d6c22386724bd3bab767477e5"
SRC_URI[sha256sum] = "115317c16ad17b6b19b465196b01001323506254fa9541dcecaf32edbecd8ca5"

S = "${WORKDIR}/interfaces-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
