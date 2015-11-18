SECTION = "devel/chicken"
DESCRIPTION = "Converts SXML to various document formats."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://multidoc.meta;md5=32ff76588c64ce96f36f789cbc225c5f"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-datatype-cross chicken-egg-sxml-transforms-cross chicken-egg-doctype-cross chicken-egg-uri-generic-cross chicken-egg-sxpath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-datatype-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-doctype-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-datatype nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-doctype nativesdk-chicken-egg-uri-generic nativesdk-chicken-egg-sxpath chicken-egg-regex-crosssdk chicken-egg-datatype-crosssdk chicken-egg-sxml-transforms-crosssdk chicken-egg-doctype-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-datatype chicken-egg-sxml-transforms chicken-egg-doctype chicken-egg-uri-generic chicken-egg-sxpath chicken-egg-regex-cross chicken-egg-datatype-cross chicken-egg-sxml-transforms-cross chicken-egg-doctype-cross chicken-egg-uri-generic-cross chicken-egg-sxpath-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-datatype chicken-egg-sxml-transforms chicken-egg-doctype chicken-egg-uri-generic chicken-egg-sxpath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/multidoc/multidoc-${PV}.tar.gz"

SRC_URI[md5sum] = "4ce0c172b34a1fef2e43b41480bede9c"
SRC_URI[sha256sum] = "c06b08a6a56e2dcb7b825412755af7b0c60a45ab74a71d18a15cb70ea0193e99"

S = "${WORKDIR}/multidoc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
