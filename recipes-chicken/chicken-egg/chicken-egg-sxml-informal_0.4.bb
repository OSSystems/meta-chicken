SECTION = "devel/chicken"
DESCRIPTION = "SXML ruleset for HTML forms"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sxml-informal.meta;md5=6728e4bd85828ba19ec8f21e9ea0c4d7"
DEPENDS_append_class-cross = " chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-sxpath chicken-egg-sxml-transforms-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS = " chicken-egg-sxml-transforms chicken-egg-sxpath chicken-egg-sxml-transforms-cross chicken-egg-sxpath-cross"
RDEPENDS_${PN} = " chicken-egg-sxml-transforms chicken-egg-sxpath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sxml-informal/sxml-informal-${PV}.tar.gz"

SRC_URI[md5sum] = "b72c21edbfd1457c5b63f0de3e4e6c1f"
SRC_URI[sha256sum] = "da1205254642f87da63931bcaaa2fb1a1d95e661a85d055fe116bee75b477d50"

S = "${WORKDIR}/sxml-informal-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
