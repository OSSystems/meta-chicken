SECTION = "devel/chicken"
DESCRIPTION = "SWANK server providing basic SLIME support."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://slime.meta;md5=dbafc341701a1fcc99238ab554575b35"
DEPENDS_append_class-cross = " chicken-egg-symbol-utils-cross chicken-egg-apropos-cross chicken-egg-chicken-doc-cross chicken-egg-fmt-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-symbol-utils-crosssdk chicken-egg-apropos-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-fmt-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-symbol-utils nativesdk-chicken-egg-apropos nativesdk-chicken-egg-chicken-doc nativesdk-chicken-egg-fmt chicken-egg-symbol-utils-crosssdk chicken-egg-apropos-crosssdk chicken-egg-chicken-doc-crosssdk chicken-egg-fmt-crosssdk"
DEPENDS = " chicken-egg-symbol-utils chicken-egg-apropos chicken-egg-chicken-doc chicken-egg-fmt chicken-egg-symbol-utils-cross chicken-egg-apropos-cross chicken-egg-chicken-doc-cross chicken-egg-fmt-cross"
RDEPENDS_${PN} = " chicken-egg-symbol-utils chicken-egg-apropos chicken-egg-chicken-doc chicken-egg-fmt"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/slime/slime-${PV}.tar.gz"

SRC_URI[md5sum] = "06f030ae2f4ab96825e1bd87a6d54c60"
SRC_URI[sha256sum] = "dbb312682c77432b7394ad3ff8ef85a362a7e487d9caf1d29dd2152a7c43cffd"

S = "${WORKDIR}/slime-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
