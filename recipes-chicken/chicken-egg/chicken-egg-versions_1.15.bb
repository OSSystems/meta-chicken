SECTION = "devel/chicken"
DESCRIPTION = "Procedures for extraction and comparison of version strings"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://versions.meta;md5=7c6caa5d2fabefde8609a610e6ed241b"
DEPENDS_append_class-cross = " chicken-egg-eggdoc-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-eggdoc-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-eggdoc chicken-egg-eggdoc-crosssdk"
DEPENDS = " chicken-egg-eggdoc chicken-egg-eggdoc-cross"
RDEPENDS_${PN} = " chicken-egg-eggdoc"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/versions/versions-${PV}.tar.gz"

SRC_URI[md5sum] = "c68b4aa749ba86815f736caac6b0a333"
SRC_URI[sha256sum] = "9a6f573ffff1852b9ddf12e1e62aeb825d2ddc5276e2111823c29c57511518c3"

S = "${WORKDIR}/versions-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
