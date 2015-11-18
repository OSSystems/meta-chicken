SECTION = "devel/chicken"
DESCRIPTION = "Use the Landauer limit to calculate my program's entropy."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://landauer.meta;md5=e57fbc093af7bbfc359e49e387b65470"
DEPENDS_append_class-cross = " chicken-egg-hahn-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-hahn-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-hahn chicken-egg-hahn-crosssdk"
DEPENDS = " chicken-egg-hahn chicken-egg-hahn-cross"
RDEPENDS_${PN} = " chicken-egg-hahn"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/landauer/landauer-${PV}.tar.gz"

SRC_URI[md5sum] = "0332649113c35890484c19ef7c7568c8"
SRC_URI[sha256sum] = "7430a1812e714cc0fbe4ccf9e07bd25cea17e94a5a31a96713dc64567caf1f00"

S = "${WORKDIR}/landauer-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
