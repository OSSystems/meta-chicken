SECTION = "devel/chicken"
DESCRIPTION = "A tool to generate atom feeds out of salmonella log files"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://salmonella-feeds.meta;md5=16cde2842302fbdaf8d45d979e7a84ea"
DEPENDS_append_class-cross = " chicken-egg-atom-cross chicken-egg-rfc3339-cross chicken-egg-salmonella-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-atom-crosssdk chicken-egg-rfc3339-crosssdk chicken-egg-salmonella-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-atom nativesdk-chicken-egg-rfc3339 nativesdk-chicken-egg-salmonella chicken-egg-atom-crosssdk chicken-egg-rfc3339-crosssdk chicken-egg-salmonella-crosssdk"
DEPENDS = " chicken-egg-atom chicken-egg-rfc3339 chicken-egg-salmonella chicken-egg-atom-cross chicken-egg-rfc3339-cross chicken-egg-salmonella-cross"
RDEPENDS_${PN} = " chicken-egg-atom chicken-egg-rfc3339 chicken-egg-salmonella"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/salmonella-feeds/salmonella-feeds-${PV}.tar.gz"

SRC_URI[md5sum] = "94f9b04a13d021af2cbdc9020b747a44"
SRC_URI[sha256sum] = "77c89de2c873eaa0cb8862facbbf0e0379fafbe7b77085756e69321970d9935f"

S = "${WORKDIR}/salmonella-feeds-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
