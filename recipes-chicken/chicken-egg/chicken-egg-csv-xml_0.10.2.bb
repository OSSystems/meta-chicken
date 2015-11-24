SECTION = "devel/chicken"
DESCRIPTION = "Parsing comma-separated values"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://csv-xml.meta;md5=84026fc2464da357047f3dd4dde177ea"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/csv-xml/csv-xml-${PV}.tar.gz"

SRC_URI[md5sum] = "a3b9bb1bd0df1525f24d3d2d74f4c805"
SRC_URI[sha256sum] = "ee3a4d5367eeb6f65fd0a22d103fc5fc3da5ebbc06a028995989e796a0f5eed6"

S = "${WORKDIR}/csv-xml-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
