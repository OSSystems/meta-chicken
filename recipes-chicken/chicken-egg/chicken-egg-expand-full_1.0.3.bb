SECTION = "devel/chicken"
DESCRIPTION = "Full macro expansion"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://expand-full.meta;md5=9d0d54f4c0f41f60b00f45ac3ab17748"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/expand-full/expand-full-${PV}.tar.gz"

SRC_URI[md5sum] = "4dc15a1c7606104f74e4140fbd6aef43"
SRC_URI[sha256sum] = "00c46e93a0b2c9f0072c607cc6bb1a2e3697b20160918b2928aaa5563f06fd83"

S = "${WORKDIR}/expand-full-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
